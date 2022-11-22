# Variable or Not Variable

While
solving [RomanToInteger](https://github.com/mitsinsar/TheJourney/blob/master/src/main/kotlin/solutions/RomanToInteger.kt)
, I've tried two approaches to see memory and cpu usage differences;

- Assign map value into variable to reduce `map.get()` calls

```
val currentNumber = romanSymbolMap[char]!!
if (...currentNumber...) {
    number -= currentNumber
} else {
    number += currentNumber
}
```

- Read directly from `map`.

```
if (...romanSymbolMap[char]!!...) {
    number -= romanSymbolMap[char]!!
} else {
    number += romanSymbolMap[char]!!
}
```

However, LeetCode submission results told me that `reading a value from a map multiple times` was faster
than `assigning it into a variable`. Seems weird, right?

| Results                   | Runtime (MS) | Memory (MB) |
|---------------------------|--------------|-------------|
| Assigning to a variable   | 545          | 42.7        |
| Reading from map directly | 433          | 41.6        |

So I dug into bytecode level to see what is going on.

## Assigning to a variable

Let's say we have a case where we need to get a value from a map and use it multiple times;

```
val currentNumber = romanSymbolMap['X']!!

number += currentNumber
number += currentNumber
```

This is what it looks like as bytecode;

```
L1
 LINENUMBER 81 L1
 ALOAD 0
 GETFIELD solutions/RomanToInteger.romanSymbolMap : Ljava/util/Map;
 BIPUSH 88
 INVOKESTATIC java/lang/Character.valueOf (C)Ljava/lang/Character;
 INVOKEINTERFACE java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; (itf)
 DUP
 INVOKESTATIC kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
 CHECKCAST java/lang/Number
 INVOKEVIRTUAL java/lang/Number.intValue ()I
 ISTORE 2
L2
 LINENUMBER 82 L2
 ILOAD 1
 ILOAD 2
 IADD
 ISTORE 1
L3
 LINENUMBER 83 L3
 ILOAD 1
 ILOAD 2
 IADD
 ISTORE 1
```

### Simplified version;

**L1** `val currentNumber = romanSymbolMap['X']!!`

&nbsp;&nbsp;&nbsp;&nbsp;We get value of `X` from `romanSymbolMap`

```
ALOAD 0
GETFIELD solutions/RomanToInteger.romanSymbolMap : Ljava/util/Map;
BIPUSH 88
INVOKESTATIC java/lang/Character.valueOf (C)Ljava/lang/Character;
INVOKEINTERFACE java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; (itf)
```

&nbsp;&nbsp;&nbsp;&nbsp;We make sure that value is not null

```
 DUP
 INVOKESTATIC kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
 CHECKCAST java/lang/Number
 INVOKEVIRTUAL java/lang/Number.intValue ()I
```

&nbsp;&nbsp;&nbsp;&nbsp;We store this value in variable

```
 ISTORE 2
```

**L2** `number += currentNumber`

&nbsp;&nbsp;&nbsp;&nbsp;We load integer value from local variable #1 `ILOAD 1` (number)

&nbsp;&nbsp;&nbsp;&nbsp;We load integer value from local variable #2 `ILOAD 2` (currentNumber)

&nbsp;&nbsp;&nbsp;&nbsp;We add them `IADD`

&nbsp;&nbsp;&nbsp;&nbsp;And store this integer value into variable #1 `ISTORE 1` (number)

**L3** `number += currentNumber`

&nbsp;&nbsp;&nbsp;&nbsp;Same as above

## Reading from map

Same case as above. But instead, we will get the value from map multiple times, without assigning it into a variable.

```
number += romanSymbolMap['X']!!
number += romanSymbolMap['X']!!
```

This is what it looks like as bytecode;

```
L1
 LINENUMBER 88 L1
 ILOAD 1
 ALOAD 0
 GETFIELD solutions/RomanToInteger.romanSymbolMap : Ljava/util/Map;
 BIPUSH 88
 INVOKESTATIC java/lang/Character.valueOf (C)Ljava/lang/Character;
 INVOKEINTERFACE java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; (itf)
 DUP
 INVOKESTATIC kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
 CHECKCAST java/lang/Number
 INVOKEVIRTUAL java/lang/Number.intValue ()I
 IADD
 ISTORE 1
L2
 LINENUMBER 89 L2
 ILOAD 1
 ALOAD 0
 GETFIELD solutions/RomanToInteger.romanSymbolMap : Ljava/util/Map;
 BIPUSH 88
 INVOKESTATIC java/lang/Character.valueOf (C)Ljava/lang/Character;
 INVOKEINTERFACE java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; (itf)
 DUP
 INVOKESTATIC kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
 CHECKCAST java/lang/Number
 INVOKEVIRTUAL java/lang/Number.intValue ()I
 IADD
 ISTORE 1
```

**L1** `number += romanSymbolMap['X']!!`

&nbsp;&nbsp;&nbsp;&nbsp;We load integer value from local variable #1 `ILOAD 1`

&nbsp;&nbsp;&nbsp;&nbsp;We get value of `X` from `romanSymbolMap` and make sure that value is not null

```
ALOAD 0
GETFIELD solutions/RomanToInteger.romanSymbolMap : Ljava/util/Map;
BIPUSH 88
INVOKESTATIC java/lang/Character.valueOf (C)Ljava/lang/Character;
INVOKEINTERFACE java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; (itf)
DUP
INVOKESTATIC kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
CHECKCAST java/lang/Number
INVOKEVIRTUAL java/lang/Number.intValue ()I
```

&nbsp;&nbsp;&nbsp;&nbsp;We add them `IADD`

&nbsp;&nbsp;&nbsp;&nbsp;And store this integer value into variable #1 `ISTORE 1`

**L2** `number += romanSymbolMap['X']!!`

&nbsp;&nbsp;&nbsp;&nbsp;Same as above

## Testing

To see the execution time differences, I ran a simple test where I used map value 10_000 times. I ran this test 1000
times and got the average execution time.

| Test Case                         | The number of repetitions | Execution Time (ns) |
|-----------------------------------|---------------------------|---------------------|
| `number += currentNumber`         | 10_000                    | 36606               |
| `number += romanSymbolMap['X']!!` | 10_000                    | 344172              |

## Conclusion

As it can be seen from bytecode analysis and test results;

- First option is faster since we store the map value into variable but uses more memory.
- Second option is slower but requires less memory compared to first option.

After submitting the same code multiple times, I've achieved getting the result below;

| Results                   | Runtime (MS) | Memory (MB) |
|---------------------------|--------------|-------------|
| Assigning to a variable   | 242          | 36          |

If we compare this result with the first one, we can see that; **if you submit your code enough, you can get pretty good
results without changing anything** :) 

