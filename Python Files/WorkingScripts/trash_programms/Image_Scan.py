import pyautogui
import time
time.sleep(1)




start = pyautogui.locateCenterOnScreen(r'C:\Users\User\Pictures\Cobbelstone_Image_Für_Python.PNG') # bewegt sich zu einem cobblestone, man sollte außerdem achten das 'r' vor dem Path hin oder weg zumachen, wenn man das Bild irgenwo auf seinem Pc hat muss man 'r' vor dem Path machen, wenn man es aber in Visual Studio direkt hat sollte man das 'r' weg machen
print(start)
pyautogui.moveTo(start)#Moves the mouse to the coordinates of the image



