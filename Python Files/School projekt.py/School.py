import sys
import pynput 
from pynput.keyboard import Listener

 
 


score = [1,2,3,4,5]
text = "hello"
saveFile = open(r"C:\Users\User\Documents\Python Scripts\School.txt","a")
saveFile.write(text + '\n')
saveFile.close()
#ich kann es auch machen, indem ich den melde button scanne und jedes mal wenn sich die farbe davon ändert, dann adde ich 1 zum count dazu und ich könnte beide versionen in einem programm machen