interface Executable<ARGS, RETURN_TYPE> {
    operator fun invoke(args: ARGS): RETURN_TYPE
}
