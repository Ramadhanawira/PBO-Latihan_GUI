# Aplikasi GUI Format Data Mahasiswa (Java Swing)

Program GUI sederhana dengan Java Swing untuk belajar konsep dasar GUI: **top level container**, **intermediate container**, **atomic components**, dan **layout**.

## Fitur

- Mengisi **Nama** dan **NIM**
- Memilih **Jurusan** dari dropdown
- Tombol **Simpan** untuk menampilkan data
- Tombol **Reset** untuk mengosongkan form

## Konsep yang Dipakai

| Konsep | Komponen |
|---|---|
| Top level container | `JFrame` |
| Intermediate container | `JPanel` |
| Atomic components | `JLabel`, `JTextField`, `JComboBox`, `JButton` |
| Layout | `BorderLayout`, `GridLayout`, `FlowLayout` |

## Struktur Tampilan

```
JFrame (BorderLayout)
├── NORTH  : Judul
├── CENTER : Form (GridLayout)
└── SOUTH  : Tombol Simpan & Reset
```

## Cara Menjalankan

Pastikan JDK sudah terpasang, lalu jalankan:

```bash
javac AplikasiGUI.java
java AplikasiGUI
```

## Cara Pakai

1. Isi Nama dan NIM
2. Pilih Jurusan
3. Klik **Simpan** untuk melihat hasil
4. Klik **Reset** untuk mengosongkan


## Hasil Output

Sebelum di isi:

<img width="478" height="360" alt="Hasil Output1" src="https://github.com/user-attachments/assets/86870ca7-1ade-46c2-8ac4-32a439e76c90" />




Setelah di isi:

<img width="657" height="357" alt="Hasil Output2" src="https://github.com/user-attachments/assets/7ad8dabf-5de4-44ba-94ea-b389dba72004" />


## Pembuat

*Nama : Wirabuana Ramadhana Jauhari*

*NIM : F1D02510030*
