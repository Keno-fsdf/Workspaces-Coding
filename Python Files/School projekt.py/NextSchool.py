from python_imagesearch.imagesearch import imagesearch
from pynput import keyboard
from datetime import datetime
from python_imagesearch.imagesearch import imagesearch
import time
import time as t
import time as t
import calendar

from datetime import datetime, time

def is_time_between(begin_time, end_time, check_time=None):
    # If check time is not given, default to current UTC time
    check_time =  datetime.now().time() #wenn ich dass verändere,dann sollte es besser funktonieren
    if begin_time < end_time:
        return check_time >= begin_time and check_time <= end_time
    else: # crosses midnight
        return check_time >= begin_time or check_time <= end_time
#funktions which reads the line above, but i am not sure how to do the above

def Datum():
    Datum = datetime.now()
    RichtigesDatum = str(Datum)
    EchtesDatumFake = RichtigesDatum[0:10]
    EchtesDatum = EchtesDatumFake.rstrip()
    
    storing_Date = open(r"C:\Users\User\Documents\Python Scripts\School projekt.py\StoringDays.txt","a")
    storing_Date.write(EchtesDatum + "\n")
    storing_Date.close()
    return EchtesDatum

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

def Reading_The_Line_above():
    Reading = open(r"C:\Users\User\Documents\Python Scripts\School projekt.py\StoringDays.txt","r")
    lines = Reading.read().splitlines()
    last_line = lines[-2]
    The_Date_Without_White_Spaces = last_line.rstrip()
    Reading.close()
    return The_Date_Without_White_Spaces
#wir müssen append machen und wenn in der zeile obendrüber das gleiche steht wie in der zeile , welche wir lesen dann ist es der gleiche tag    q

#siehe Zeile 98

def Imagesearcher():
    Meldungen = 0
    def Total_Amount_ouf_Meldung_writing(x):
        Writing_Meldungen_Into_Document = open(r"C:\Users\User\Documents\Python Scripts\School projekt.py\Meldungen.txt","a")
        Writing_Meldungen_Into_Document.write("Insgesamte Meldungen während der " + str(x) + " Stunde: "+ str(Meldungen) + "\n" + "\n")
        Writing_Meldungen_Into_Document.close()
    while True:
        if is_time_between(time(8,34),time(8,36)) or is_time_between(time(19,30),time(19,32)) or is_time_between(time(10,29),time(10,31)) or is_time_between(time(11,14),time(11,16)) or is_time_between(time(12,14),time(12,15)) or is_time_between(time(12,59),time(13,1)) ==True:
            Ende_der_Stunde = True
            print(Ende_der_Stunde)
            counter = 0
            while counter < 6:
                if counter == 0:
                    a = 9 # i gotta change these variables depending on which time it is
                    b = 55
                    c = 21
                    d = 40

                    

                    if is_time_between(time(a,b), time(c,d)) == True:  #while schleife?

                        #write into the textfile
                        print("it is in the first hour")
                        # Meldungen = Meldungen + 1
                        print(Meldungen)
                        if Datum() == Reading_The_Line_above():
                            print("It is the same day")   
                            #print die insgesamten Meldungen
                        else:
                            print("it is not the same day")
                            Writing_Day_Into_Document = open(r"C:\Users\User\Documents\Python Scripts\School projekt.py\Meldungen.txt","a")
                            Writing_Day_Into_Document.write(Day() + ":" + "\n")
                            Writing_Day_Into_Document.close()
                            

                        Total_Amount_ouf_Meldung_writing(1)
                        Meldungen = 0
                        t.sleep(60)
                        #f######################################################################
                        #########################################################################s#lepp#
                        
                        break
                    
                    else:
                        # print("it isnt in the first hour")
                        counter = counter +1
                    
                    
                if counter == 1:
                    a = 8
                    b = 20
                    c = 9
                    d = 25

                    

                    if is_time_between(time(a,b), time(c,d)) == True:  #while schleife?

                        #write into the textfile
                        print("it is in the second hour")
                        # Meldungen = Meldungen + 1
                        print(Meldungen)
                        if Datum() == Reading_The_Line_above():
                            print("It is the same day")   
                            #print die insgesamten Meldungen
                        else:
                            print("it is not the same day")
                            Writing_Day_Into_Document = open(r"C:\Users\User\Documents\Python Scripts\School projekt.py\Meldungen.txt","a")
                            Writing_Day_Into_Document.write(Day() + ":" + "\n")
                            Writing_Day_Into_Document.close()
                            

                        Total_Amount_ouf_Meldung_writing(2)
                        Meldungen = 0
                        t.sleep(60)
                        #f######################################################################
                        #########################################################################s#lepp#
                        
                        break
                    
                    else:
                        # print("it isnt in the first hour")
                        counter = counter +1
                            
                if counter == 2:
                    a = 9
                    b = 45
                    c = 10
                    d = 30

                    

                    if is_time_between(time(a,b), time(c,d)) == True:  #while schleife?

                        #write into the textfile
                        print("it is in the third hour")
                        # Meldungen = Meldungen + 1
                        print(Meldungen)
                        if Datum() == Reading_The_Line_above():
                            print("It is the same day")   
                            #print die insgesamten Meldungen
                        else:
                            print("it is not the same day")
                            Writing_Day_Into_Document = open(r"C:\Users\User\Documents\Python Scripts\School projekt.py\Meldungen.txt","a")
                            Writing_Day_Into_Document.write(Day() + ":" + "\n")
                            Writing_Day_Into_Document.close()
                            

                        Total_Amount_ouf_Meldung_writing(3)
                        Meldungen = 0
                        t.sleep(60)
                        #f######################################################################
                        #########################################################################s#lepp#
                        
                        break
                    
                    else:
                        # print("it isnt in the first hour")
                        counter = counter +1
                if counter == 3:
                    a = 10
                    b = 30
                    c = 11
                    d = 15

                    

                    if is_time_between(time(a,b), time(c,d)) == True:  #while schleife?

                        #write into the textfile
                        print("it is in the fourth hour")
                        # Meldungen = Meldungen + 1
                        print(Meldungen)
                        if Datum() == Reading_The_Line_above():
                            print("It is the same day")   
                            #print die insgesamten Meldungen
                        else:
                            print("it is not the same day")
                            Writing_Day_Into_Document = open(r"C:\Users\User\Documents\Python Scripts\School projekt.py\Meldungen.txt","a")
                            Writing_Day_Into_Document.write(Day() + ":" + "\n")
                            Writing_Day_Into_Document.close()
                            

                        Total_Amount_ouf_Meldung_writing(4)
                        Meldungen = 0
                        t.sleep(60)
                        #f######################################################################
                        #########################################################################s#lepp#
                        
                        break
                    
                    else:
                        # print("it isnt in the first hour")
                        counter = counter +1
                if counter == 4:
                    a = 11
                    b = 30
                    c = 12
                    d = 15

                    

                    if is_time_between(time(a,b), time(c,d)) == True:  #while schleife?

                        #write into the textfile
                        print("it is in the fifth hour")
                        # Meldungen = Meldungen + 1
                        print(Meldungen)
                        if Datum() == Reading_The_Line_above():
                            print("It is the same day")   
                            #print die insgesamten Meldungen
                        else:
                            print("it is not the same day")
                            Writing_Day_Into_Document = open(r"C:\Users\User\Documents\Python Scripts\School projekt.py\Meldungen.txt","a")
                            Writing_Day_Into_Document.write(Day() + ":" + "\n")
                            Writing_Day_Into_Document.close()
                            

                        Total_Amount_ouf_Meldung_writing(5)
                        Meldungen = 0
                        t.sleep(60)
                        #f######################################################################
                        #########################################################################s#lepp#
                        
                        break
                    
                    else:
                        # print("it isnt in the first hour")
                        counter = counter +1
                if counter == 5:
                    a = 12
                    b = 15
                    c = 13
                    d = 0


                    if is_time_between(time(a,b), time(c,d)) == True:  #while schleife?

                        #write into the textfile
                        print("it is in the sixth hour")
                        # Meldungen = Meldungen + 1
                        print(Meldungen)
                        if Datum() == Reading_The_Line_above():
                            print("It is the same day")   
                            #print die insgesamten Meldungen
                        else:
                            print("it is not the same day")
                            Writing_Day_Into_Document = open(r"C:\Users\User\Documents\Python Scripts\School projekt.py\Meldungen.txt","a")
                            Writing_Day_Into_Document.write(Day() + ":" + "\n")
                            Writing_Day_Into_Document.close()
                            

                        Total_Amount_ouf_Meldung_writing(6)
                        Meldungen = 0
                        t.sleep(60)
                        #f######################################################################
                        #########################################################################s#lepp#
                        
                        break
                    
                    else:
                        # print("it isnt in the first hour")
                        counter = counter +1

                if counter == 6:
                    print("it is not in the range of the school time")
                    break
            
       


            #t.sleep(60)
        else:
            #print("it is not the time")

            while True:
                pos = imagesearch(r"C:\Users\User\Desktop\Picture_From_Discord_For_Python.PNG") #for scanning only a area
                # print(pos)



                if pos[0] != -1:
                    print("Picture found")
                    # Datum()
                    a = 0
                    b = 0
                    c = 0
                    d = 0
                    counter = 0
                    
                    t.sleep(1)
                    while counter < 6:
                        if counter == 0:
                            a = 7 # i gotta change these variables depending on which time it is
                            b = 55
                            c = 20
                            d = 40
                            
                            

                            if is_time_between(time(a,b), time(c,d)) == True:  #while schleife?

                                #write into the textfile
                                print("it is in the first hour")
                                Meldungen = Meldungen + 1
                                print(Meldungen)
                                if Datum() == Reading_The_Line_above():
                                    print("It is the same day")   
                                
                                else:
                                    print("it is not the same day")
                                    Writing_Day_Into_Document = open(r"C:\Users\User\Documents\Python Scripts\School projekt.py\Meldungen.txt","a")
                                    Writing_Day_Into_Document.write(Day() + ":" + "\n")
                                    Writing_Day_Into_Document.close()

                                # if checking_that_8:45 ist ==True:  # ich könnte dies mit sekunden machen, obwohl es unwahrscheinlich ist, dass ich mich zweimal in einer minute melde
                                    # Writing_Insgesamt_Meldungen_Into_Document = open(r"C:\Users\User\Documents\Python Scripts\School projekt.py\Meldungen.txt","a")
                                    # Writing_Insgesamt_Meldungen_Into_Document.write("Meldungen in der ersten Stunde:" + str(Meldungen))
                                    # Writing_Insgesamt_Meldungen_Into_Document.close()
                                    # Writing_Insgesamt_Meldungen_Into_Document.write(Meldungen)
                                    #ich könnte eine seperate while schleife machen, die druchgehende schaut ob es 8:45 ist und wenn ja, dass es Insgesamte meldungen und so weiter hinschreibt.
                                break
                            
                            else:
                                # print("it isnt in the first hour")
                                counter = counter +1
                            
                            
                        if counter == 1:
                            a = 8
                            b = 40
                            c = 9
                            d = 25

                            

                            if is_time_between(time(a,b), time(c,d)) == True:  #while schleife?
                                #write into the textfile
                                print("it is in the second hour")
                                break
                            else:
                                # print("it isnt in the second hour")
                                counter = counter +1
                                    
                        if counter == 2:
                            a = 9
                            b = 45
                            c = 10
                            d = 30

                            

                            if is_time_between(time(a,b), time(c,d)) == True:  #while schleife?
                                #write into the textfile
                                print("it is in the third hour")
                                break
                            else:
                                # print("it isnt in the third hour")
                                counter = counter +1
                            
                        if counter == 3:
                            a = 10
                            b = 30
                            c = 11
                            d = 15

                            

                            if is_time_between(time(a,b), time(c,d)) == True:  #while schleife?
                                #write into the textfile
                                print("it is in the fourth hour")
                                break
                            else:
                                # print("it isnt in the fourth hour")
                                counter = counter +1

                        if counter == 4:
                            a = 11
                            b = 30
                            c = 12
                            d = 15

                            

                            if is_time_between(time(a,b), time(c,d)) == True: 
                                
                                print("it is in the fifth hour")
                                
                                break
                            else:
                                # print("it isnt in the fifth hour")
                                counter = counter +1

                        if counter == 5:
                            a = 12
                            b = 15
                            c = 13
                            d = 0


                            if is_time_between(time(a,b), time(c,d)) == True:  #while schleife?
                                #write into the textfile
                                print("it is in the sixth hour")
                                break
                            else:
                                # print("it isnt in the sixth hour")
                                counter = counter +1

                        if counter == 6:
                            print("it is not in the range of the school time")
                            break
                    
                else:
                    print("Didnt fount the image yet")
                    
                    t.sleep(1)
                    break  #break statement new
            

Imagesearcher()