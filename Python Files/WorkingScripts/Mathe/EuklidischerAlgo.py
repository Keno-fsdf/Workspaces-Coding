def extended_gcd(a, b):
    if a == 0:
        return b, 0, 1
    else:
        g, x, y = extended_gcd(b % a, a)
        return g, y - (b // a) * x, x

# Beispielaufruf
a = int(input("Geben Sie die erste Zahl (a) ein: "))
b = int(input("Geben Sie die zweite Zahl (b) ein: "))

ggt, x, y = extended_gcd(a, b)

print(f"Der größte gemeinsame Teiler von {a} und {b} ist: {ggt}")
print(f"Die Werte von x und y sind: x = {x}, y = {y}")
