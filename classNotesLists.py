# lists are a collection of data
# lists have an order to them

myList = [45, 20, 10, "yellow", True]
original = myList.copy()
print(myList)

# these loops do the same thing
for item in myList:
    print(item)

for i in range(len(myList)):
    print(myList[i])

# add items to a list

myList.append("abby")
print(myList)

myList.insert(2, "vera")
print(myList)

# remove items from a list

myList.pop()
print(myList)

# remove at particular index
myList.pop(2)
print(myList)

# remove specific elements
myList.append("yellow")
print(myList)
myList.remove("yellow")
print(myList)

# check to see if an item is in a list

if 45 in myList:
    print(True)

else:
    print(False)

print(original)


#Example problem.
# Given a list of integers, calculate the average

L = [34, 500, 101, 4, 7, 9, 25]
total = 0
for num in L:
    total = total + num

avg = total / len(L)

print(avg)

# Given a list of words, print the smallest
# and the largest word

S = ["Chicago", "New York", "Boston", "Beijing", "Tokyo", "Hangzhou", "Copenhagen"]

maxCity = 0
maxName = ""
minCity = 999
minName = ""
for city in S:
    if len(city) > maxCity:
        maxCity = len(city)
        maxName = city

    if len(city) < minCity:
        minCity = len(city)
        minName = city

print("The city with the longest name is: " + maxName)
print("The city with the shortest name is: " + minName)


    


















