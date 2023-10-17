from python_imagesearch.imagesearch import imagesearch
import time

from pynput import keyboard
import time as t
from datetime import datetime
from datetime import datetime, time
from datetime import datetime, time

def is_time_between(begin_time, end_time, check_time=None):
    # If check time is not given, default to current UTC time
    check_time =  datetime.now().time()
    if begin_time < end_time:
        return check_time >= begin_time and check_time <= end_time
    else: # crosses midnight
        return check_time >= begin_time or check_time <= end_time



def Datum():
    Datum = datetime.now()
    RichtigesDatum = str(Datum)
    EchtesDatumFake = RichtigesDatum[0:10]
    EchtesDatum = EchtesDatumFake.rstrip()
    
    storing_Date = open(r"C:\Users\User\Documents\Python Scripts\School projekt.py\StoringDays.txt","a")
    storing_Date.write(EchtesDatum + "\n")
    storing_Date.close()
    return EchtesDatum


def Reading_The_Line_above():
    Reading = open(r"C:\Users\User\Documents\Python Scripts\School projekt.py\StoringDays.txt","r")
    lines = Reading.read().splitlines()
    last_line = lines[-2]
    The_Date_Without_White_Spaces = last_line.rstrip()
    Reading.close()
    return The_Date_Without_White_Spaces
Meldungen = 0

print(is_time_between(time(19,21),time(19,21)))