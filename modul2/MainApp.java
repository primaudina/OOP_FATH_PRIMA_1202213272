public class MainApp {

    public static void main(string[] args) {
        System.out.println ("Class TransportasiAir");
        trns.transportasiAir = new TransportasiAir (4,20000);
        trns.transportasiAir = 
    }
    
}

namaMakanan_1 = input("Masukkan Nama Barang1 : ")
kodeMakanan_1 = int(input("Masukkan Kode Barang1 : "))
hargaMakanan_1 = float(input("Masukkan Harga Barang1 : "))
estimasiPembuatanMakanan_1 = int(input("Masukkan Jumlah Barang1: "))
diskonMakanan_1 = float(input("Masukkan Diskon Barang1 : "))

namaMakanan_2 =  input("Masukkan Nama Barang2 : ")
kodeMakanan_2 = int(input("Masukkan Kode Barang2 : "))
hargaMakanan_2 = float(input("Masukkan Harga Barang2 : "))
estimasiPembuatanMakanan_2 = int(input("Masukkan Jumlah Barang2: "))
diskonMakanan_2 = float(input("Masukkan Diskon Barang2 : "))

namaMinuman_3 =  input("Masukkan Nama Barang3 : ")
kodeMinuman_3 = int(input("Masukkan Kode Barang3 : "))
hargaMinuman_3 = float(input("Masukkan Harga Barang3 : "))
estimasiPembuatanMinuman_3 = int(input("Masukkan Jumlah Barang3: "))
diskonMinuman_3 = float(input("Masukkan Diskon Barang3 : "))

daftarMenu = []
daftarJumlah = []
daftarWaktu = []

while True:
    while True:
        variabel_pemesanan_makanan = int(input())
        if variabel_pemesanan_makanan == 11001:
            variabel_jmlh_pesanan = int(input())
            daftarWaktu.append(variabel_jmlh_pesanan*estimasiPembuatanMakanan_1)
            daftarMenu.append(namaMakanan_1)
            daftarJumlah.append(variabel_jmlh_pesanan)
    
            break
    
        elif variabel_pemesanan_makanan == 11005:
            variabel_jmlh_pesanan = int(input())
            daftarWaktu.append(variabel_jmlh_pesanan*estimasiPembuatanMakanan_2)
            daftarMenu.append(namaMakanan_2)
            daftarJumlah.append(variabel_jmlh_pesanan)
        
            break
        
        elif variabel_pemesanan_makanan == 12001:
            variabel_jmlh_pesanan = int(input())
            daftarWaktu.append(variabel_jmlh_pesanan*estimasiPembuatanMinuman_3)
            daftarMenu.append(namaMinuman_3)
            daftarJumlah.append(variabel_jmlh_pesanan)
        
            break
        else:
            print("Mohon maaf, menu belum tersedia")
    
    input_user = input("Apakah anda ingin menambah pesanan lagi?(y/n)")
    if input_user == "n":
        break

print("\n=======================================\nNama Menu | Jml | Estimasi Waktu |")
for daftarMenu,daftarJumlah,daftarWaktu in zip(daftarMenu,daftarJumlah,daftarWaktu):
    print(f"{daftarMenu} | {daftarJumlah} | {daftarWaktu} |")
print("=======================================")
