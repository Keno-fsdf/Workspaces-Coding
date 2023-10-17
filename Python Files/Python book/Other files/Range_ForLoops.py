for i in range(12,15):
    print(i)


for i in range(0,10,3): #The first and second determines where the for loop starts and ends and the third value determines the step
    #The step is the amount that the variable is increased by after each iteration.
    print(i)

for i in [0, 1, 2, 3]: #using lists instead for range
    print(i)


supplies = ["pen","flame-throwers","pencils"]
for i in range(len(supplies)):
    print("Index "+ str(i)+ "  in supplies is " + supplies[i])