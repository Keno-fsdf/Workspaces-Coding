from python_imagesearch.imagesearch import imagesearch
import time
from pynput import keyboard
import time
from datetime import datetime
count = 0
def Meldungen_Zählen():
    
    global count
    count = count +1
    
    return count


print(Meldungen_Zählen())