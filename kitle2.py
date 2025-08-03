def kitle_endeksi():
    print("Hoşgeldiniz")
    kg = float(input("Kilonuzu(kg) Giriniz"))
    boy = float(input("Boyunuzu(metre) Giriniz"))
    kitle_endeksi = kg / (boy / boy)
    print(f"Kitle Endeksiniz :{kitle_endeksi}")

    if kitle_endeksi < 10 :
        print("Zargana Kilo Al")
    elif 10 <= kitle_endeksi <= 20 :
        print("İdealimsi")
    else :
        print("Obez Kilo Ver")
kitle_endeksi()