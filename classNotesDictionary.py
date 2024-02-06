# Dictionaries are like sets. They only hold unique items. There is no order

# Dictionary items are key : value pairs

'''D = { "apple": "A fruit that you might eat or put in a pie" }

print(D)

# edit the dictionary

D.update({"orange":"A fruit OR a color", "watermelon":"large fruit" })
D.update({"apple": "something you look at"})

print(D)

# get() returns the value for the key used as input

print(D.get("apple"))
print(D.keys())'''

# mathematical example. Student grades

student1 = "J"
student2 = "N"
student3 = "C"

grades1 = [96, 58, 72, 85, 88, 90]
grades2 = [90, 22, 55, 75, 99, 94]
grades3 = [91, 68, 74, 89, 85, 92]

gradebook = {}

gradebook.update({student1 : 65, student2 : 70, student3 : 88})

# each grade in the list will allow us to update the current grade
# of the student to have a new value = the new grade + the old grade
for g in grades1:
    gradebook.update({student1: g + gradebook.get(student1)})

gradebook.update({student1 : gradebook.get(student1) / 7})

#student 2
for g in grades2:
    gradebook.update({student2: g + gradebook.get(student2)})

gradebook.update({student2 : gradebook.get(student2) / 7})

#student 3
for g in grades3:
    gradebook.update({student3: g + gradebook.get(student3)})

gradebook.update({student3 : gradebook.get(student3) / 7})

print(gradebook)

# get a new grade from the user
newgrade = input("What student is this?")
newValue = int(input("What was their grade?"))

if newgrade in gradebook:
    gradebook.update({newgrade : newValue/8 + 7*gradebook.get(newgrade)/8})
else:
    gradebook.update({newgrade : newValue})
print(gradebook)




















