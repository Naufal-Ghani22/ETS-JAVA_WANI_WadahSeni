README.txt - Tugas UTS Pemrograman Berorientasi Objek (Java)

1. Alasan Pemilihan Domain:
Tuliskan secara singkat alasan Anda memilih domain sistem ini. Misalnya: karena sesuai dengan minat pribadi, pengalaman nyata, atau karena memiliki kompleksitas yang sesuai untuk OOP.
-->
Saya memilih domain Galeri Seni Digital dengan nama Wadah Seni karena sesuai dengan minat pribadi saya terhadap seni dan teknologi. Selain itu, proyek ini memiliki struktur data yang cocok untuk diterapkan dalam konsep Object-Oriented Programming (OOP). Terdapat banyak entitas nyata seperti karya seni, artis, dan pembeli, yang bisa direpresentasikan dalam bentuk kelas dan objek, sehingga menjadi media latihan yang efektif untuk memahami pewarisan (inheritance), komposisi, dan enkapsulasi.



2. Penjelasan Singkat Hubungan Antar Kelas:
Jelaskan bagaimana kelas-kelas saling berinteraksi. Sebutkan kelas induk, kelas turunan, dan hubungan komposisi (misalnya: Transaksi memiliki banyak Item).
-->
- Kelas Induk:
	KaryaSeni adalah kelas induk yang merepresentasikan karya seni secara umum.

- Kelas Turunan:
	Lukisan dan Patung adalah subclass (turunan) dari KaryaSeni. Masing-masing memiliki 	atribut tambahan spesifik, yaitu teknik dan bahan.

- Komposisi:
	Kelas Pembeli memiliki koleksi berupa daftar objek KaryaSeni → ini mencerminkan 	hubungan "has-a" (1 Pembeli memiliki banyak Karya).

	Kelas KaryaSeni memiliki atribut Artis → setiap karya dibuat oleh satu artis → ini 	juga adalah komposisi.

- Relasi Lain:
	Kelas TransaksiSeni bersifat utility/helper class yang menyediakan logika transaksi 	seperti penerapan diskon dan pencetakan struk.

3. Contoh Logika Penting yang Digunakan:
Jelaskan satu atau dua method yang menurut Anda penting. Misalnya: metode perhitungan total harga, metode diskon, atau logika validasi input.
-->
1. Perhitungan Total Harga (Method hitungTotal() di kelas Pembeli)
2. Diskon Transaksi (Method applyDiskon() di kelas TransaksiSeni)

4. Refleksi Pribadi:
- Apa tantangan paling sulit saat mengerjakan tugas ini, dan bagaimana Anda menyelesaikannya?
- Bagian kode mana yang menurut Anda paling menarik dan jelaskan mengapa
-->
a. Tantangan Paling Sulit
Tantangan terbesar dalam tugas ini adalah mengatur navigasi antar dua peran. Karena dalam pembuatan itu perlu mengatur penambahan kode yg posisinya krusial apabila dipindah sembarangan. Saya menyelesaikannya dengan membuat menu awal yang meminta pengguna memilih peran, dan kemudian menyediakan opsi kembali agar mereka bisa berpindah antar mode peran.

b. Bagian Kode Paling Menarik
Bagian paling menarik adalah struktur pewarisan antara KaryaSeni, Lukisan, dan Patung. Dengan menggunakan inheritance, saya bisa memanfaatkan kembali method dan atribut dari kelas induk, serta menambahkan properti unik masing-masing subclass. Ini memperlihatkan kekuatan konsep OOP dalam menyederhanakan dan mengorganisasi kode dengan lebih elegan.

Catatan:
File ini wajib diisi dan disertakan dalam folder ZIP bersama file .java dan screenshot program.
