def hesap_makinesi():
    print("Hoşgeldiniz Hesap Makinesi")
    print("1.İşlem Toplama")
    print("2.İşlem Çıkarma")
    print("3.İşlem Bölme")
    print("4.İşlem Çarpma")

    secim = input("Bir İşlem Seçin (1/2/3/4): ")

    if secim in ["1" , "2" , "3" , "4" ]:
        sayi1 = float(input("Birinci Sayıyı Giriniz "))
        sayi2 = float(input("İkinci Sayıyı Giriniz "))

        if secim == "1" :
            print("Sonuç :" , (sayi1 + sayi2))
        elif secim == "2" :
            print ("Sonuç :" , (sayi1 - sayi2))
        elif secim == "3" :
            if sayi2 != 0:
                print("Sonuç:", sayi1 / sayi2)
            else:
                print("Hata: Sıfıra bölme yapılamaz.")
        else :
            print ("Sonuç :", (sayi1 * sayi2))
    else:
        print("Geçersiz seçim.")
hesap_makinesi()

    