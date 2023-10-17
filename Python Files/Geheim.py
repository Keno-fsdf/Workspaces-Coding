def how_many():
    request = input("How many Ints would you like from 2 - 3?")
    if request == "2":
        print(highnum())
    elif request == "3": 
        print(highnum2())
    else:
        return "not valid number"




def highnum():
    question1 = input("Enter a INT")
    question2 = input("Enter another INT")
    if question1 > question2:
        print(question1 + " is  higher than " + question2)
    elif question2 > question1:
        print(question2 + " is higher than " + question1)
def highnum2():
    question12 = (input)("Enter a INT")
    question22 = (input)("Enter another INT")
    question32 = (input)("Enter another one")
    if question12 > question22 and question12 > question32:
        print(question12 + " is  higher than " + question22 + " and " + question32 )
    elif question22 > question12 and question22 > question32:
        print(question22 + " is  higher than " + question12 + " and " + question32 )
    elif question32 > question22 and question32 > question12:
        print(question32 + " is  higher than " + question22 + " and " + question12 )
    else:
        return "Error"


while True:
    print(how_many())