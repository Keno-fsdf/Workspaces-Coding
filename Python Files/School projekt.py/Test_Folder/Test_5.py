from python_imagesearch.imagesearch import imagesearch
from pynput import keyboard
from datetime import datetime
from python_imagesearch.imagesearch import imagesearch
import time
import time as t
from python_imagesearch.imagesearch import imagesearch
from pynput import keyboard
from datetime import datetime
from python_imagesearch.imagesearch import imagesearch
import time
import time as t
import calendar
from datetime import datetime, time

def Datum():
    Datum = datetime.now()
    RichtigesDatum = str(Datum)
    EchtesDatumFake = RichtigesDatum[0:10]
    EchtesDatum = EchtesDatumFake.rstrip()
    
    storing_Date = open(r"C:\Users\User\Documents\Python Scripts\School projekt.py\StoringDays.txt","a")
    storing_Date.write(EchtesDatum + "\n")
    storing_Date.close()
    return EchtesDatum
# print(Datum())

def Reading_The_Line_above():
    Reading = open(r"C:\Users\User\Documents\Python Scripts\School projekt.py\StoringDays.txt","r")
    lines = Reading.read().splitlines()
    last_line = lines[-2]
    The_Date_Without_White_Spaces = last_line.rstrip()
    Reading.close()
    return The_Date_Without_White_Spaces

def Day():
    Datum = datetime.now()
    RichtigesDatum = str(Datum)
    EchtesDatumFake = RichtigesDatum[0:10]
    EchtesDatumFake2 = EchtesDatumFake.rstrip()
    EchtesDatumFake3 = EchtesDatumFake2.split("-")
    s = [str(i) for i in EchtesDatumFake3] # Converting integers into strings
    result = str("".join(s)) # Join the string values into one string
    Jahre = int(str(result)[0:4])
    Monate = int(str(result)[4:6])
    Tage = int(str(result)[6:8])
    days=["Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"]
    
    

    today = calendar.weekday(Jahre,Monate,Tage)
    return(days[today])
    

print(Day())
#funktions which reads the line above, but i am not sure how to do the above^1
# print(Reading_The_Line_above())


# if Reading_The_Line_above() == Datum():
    # print("they are the same")
# else:
    # print("they are not the same")