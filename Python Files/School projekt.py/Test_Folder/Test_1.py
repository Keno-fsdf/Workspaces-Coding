from python_imagesearch.imagesearch import imagesearch
import time
from pynput import keyboard
import time
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

# Original test case from OP
print(is_time_between(time(10,30), time(17,2)))

# Test case when range crosses midnight
# print(is_time_between(time(8,00), time(16,00)))