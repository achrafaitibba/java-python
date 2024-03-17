import sys

def function1(param1: typing.Callable[[], str] = lambda: input('Please enter your phone (or bot token): '),
                          , param2):
    print(f"Function 1 called with parameters: {param1}, {param2}")


if __name__ == "__main__":
    if len(sys.argv) < 4:
        print("Usage: python hello.py <function> <param1> <param2>")
        sys.exit(1)

    function_name = sys.argv[1]
    param1 = sys.argv[2]
    param2 = sys.argv[3]
    if function_name == "function1":
        function1(param1, param2)
    elif function_name == "function2":
        function2(param1, param2)
    else:
        print("Function not found")