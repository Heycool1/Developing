import random
t = "tas"
k = "kagit"
m = "makas"
choice = input('Hoş geldiniz! Taş Kağıt Makas Seçiniz! (T/K/M): ').lower()
if choice == "ys":
    print("Kolaydı Kazandın")
    exit()
elif choice == "t":
    player = t
elif choice == "k":
    player = k
elif choice == "m":
    player = m
else:
    print("Geçersiz giriş!")
    exit()
enemy = random.choice([t, k, m])
print("Bilgisayarın seçimi:", enemy)
if player == enemy:
    print("Berabere!")
elif (player == t and enemy == m) or (player == k and enemy == t) or (player == m and enemy == k):
    print("Kazandın!")
else:
    print("Kaybettin!")

