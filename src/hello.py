import sys
#print("hello world")

def function1():
    print("Function 1 called")


if __name__ == "__main__":
    if len(sys.argv) < 2:
        print("Usage: python hello.py <function>")
        sys.exit(1)

    function_name = sys.argv[1]
    if function_name == "function1":
        function1()
    elif function_name == "function2":
        function2()
    else:
        print("Function not found")