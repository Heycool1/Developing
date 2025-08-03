def atm():
    sifre = 1975
    bakiye = 200000

    deneme = int(input(" Şifre giriniz: "))
    if deneme != sifre:
        print(" Yanlış şifre!")
        return

    print("Hoşgeldiniz Hesap Sistemine!")
    print("1. Para Çekme")
    print("2. Para Yatırma")
    print("3. Bakiye Sorgulama")
    print("4. Şifre Değiştirme")

    secim = input("Bir işlem seçin (1/2/3/4): ")

    if secim == "1":
        tutar = float(input(" Çekmek istediğiniz tutarı girin: "))
        if tutar <= bakiye:
            bakiye -= tutar
            print(f" {tutar} TL başarıyla çekildi. Yeni bakiyeniz: {bakiye} TL")
        else:
            print(" Yetersiz bakiye.")

    elif secim == "2":
        tutar = float(input(" Yatırmak istediğiniz tutarı girin: "))
        bakiye += tutar
        print(f" {tutar} TL başarıyla yatırıldı. Yeni bakiyeniz: {bakiye} TL")

    elif secim == "3":
        print(f" Mevcut bakiyeniz: {bakiye} TL")

    elif secim == "4":
        yeni_sifre = int(input("Yeni şifrenizi giriniz: "))
        sifre = yeni_sifre
        print(f" Şifreniz başarıyla {sifre} olarak güncellendi")

    else:
        print("Geçersiz seçim")

atm()
