
def getInfo(s):
    chars = {"a":0,
             "b":0,
             "c":0,
             "d":0,
             "e":0,
             "f":0,
             "g":0,
             "h":0,
             "i":0,
             "j":0,
             "k":0,
             "l":0,
             "m":0,
             "n":0,
             "o":0,
             "p":0,
             "q":0,
             "r":0,
             "s":0,
             "t":0,
             "u":0,
             "v":0,
             "w":0,
             "x":0,
             "y":0,
             "z":0}

    #remove spaces from the string
    s = s.replace(" ", "")

    #create a list of all of the possible character
    listOfChars = chars.keys()

    #loop through each character in the string
    for c in s:
        c = c.lower()
        if c in listOfChars:
            # new value in the dictionary is the previous value + 1
            chars.update({c:chars.get(c) + 1})

    print(chars)

    minC = ""
    maxC = ""
    minAmount = 99999
    maxAmount = 0

    for c in s:
        c = c.lower()
        v = chars.get(c)
        if v > maxAmount:
            maxAmount = v
            maxC = c
        if v < minAmount:
            minAmount = v
            minC = c

    return [minC, minAmount, maxC, maxAmount]

def main():

    s = input("Type anything\n")
    results = getInfo(s)
    print(" ---------- Calculating ----------- ")
    print("The minimum character used is " + results[0] + "," + str(results[1]) + " times")
    print("The maximum character used is " + results[2] + "," + str(results[3]) + " times")
    

if __name__ == "__main__":
    main()
