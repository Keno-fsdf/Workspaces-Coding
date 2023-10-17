#p34 summieren und subtrahieren von zahlen üben
#Kalchmayr
#12.12.2019
##############################up#####################
def add(a,b):
    summe=zahl+zahl2
    return summe
def sub(c,d):
    diff=zah1-zahl3
    return diff

##############################hp#####################
print "Summieren und subtrahieren"

b="ja"
while b=="ja" or b=="Ja":
    zahl=100
    a=raw_input("Willst du subtrahieren oder addieren (s/c)?")
    



    if a=="s":
        zahl2=input("Gib die Zahl ein die du dazu rechnen willst")
        add(zahl,zahl2)
        print "Deine Zahl lautet",add(zahl,zahl2)
    elif a=="c":
        zahl3=input("Gib die Zahl ein die du abziehen möchtest")
        sub(zahl,zahl3)
        print zahl,"-",a
        print "Deine Zahl lautet",sub(zahl,zahl3)
    else:
        print "DU bist dummm"
        print "Willst du noch mehr abziehen/hinzufügen?(ja/nein)"
        