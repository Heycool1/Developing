import random

def sayi_tahmin_oyunu() :
    gizli_sayi = random.randint(1,100)
    tahmin_sayisi = 0

    print("1 ile 100 arasında bir sayı tuttum tahmin et ")

    while True:
        try:
            tahmin = int(input("Tahmin et"))
            tahmin_sayisi += 1

            if tahmin > gizli_sayi :
                print("Daha Küçük Bir Sayı dene ")
            elif tahmin < gizli_sayi :
                print("Daha Büyük Bir Sayı dene ")
            else :
                print(f"Aferin {tahmin_sayisi} denemede bildin Doğru Sayı : {gizli_sayi}")
                break
        except ValueError :
            print("Geçerli Bir Tam Sayı Girin! ")    
sayi_tahmin_oyunu()