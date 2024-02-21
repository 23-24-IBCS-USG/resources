import turtle


win = turtle.Screen()
t = turtle.Turtle()

t.speed(5)
t.shape("turtle")
t.stamp()
t.forward(100)
t.stamp()

t.penup()

t.right(90)
t.forward(200)

t.pendown()
t.color("red")
t.stamp()

t.right(90)
t.forward(100)
t.stamp()

t.clear()

#create a square

for i in range(4):
    t.forward(100)
    t.right(90)
t.up()
t.goto(200, 200)
t.down()

#create something random
# i starts at 0 --> 19
for i in range(20):
    t.forward(200/(i+1))
    t.left(i*10)









