# f is a file object that is created using the name "sample.txt"

f = open("sample.txt")

# s is a string of the entire text in that file
s = f.read()

print(s)

# method which splits a string into a list of strings separated by blank space
l = s.split("***")

s = l[2]

s = s.split()

print(l)

for word in s:
    word = word.replace(".", "")
    word = word.replace("!", "")
    word = word.replace(",", "")
    print(word)
