def add(a, b):
    return a + b


def subtract(a, b):
    return a - b


def multiply(a, b):
    return a * b


def divide(a, b):
    if b == 0:
        raise ValueError("Cannot divide by zero")
    return a / b


def percentage(value, total):
    if total == 0:
        raise ValueError("Total cannot be zero")
    return (value / total) * 100


if __name__ == "__main__":
    print("Calculator Application")

    print("Addition:", add(20, 10))
    print("Subtraction:", subtract(20, 10))
    print("Multiplication:", multiply(20, 10))
    print("Division:", divide(20, 10))
    print("Percentage:", percentage(25, 100))