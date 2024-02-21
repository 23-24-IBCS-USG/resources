import turtle

def square(t, size):
    for i in range(4):
        t.forward(size)
        t.right(90)

def main():

    win = turtle.Screen()
    t = turtle.Turtle()

    square(t, 300)


if __name__ == "__main__":
    main()
