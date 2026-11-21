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
<img width="475" height="360" alt="Screenshot 2026-11-21 112324" src="https://github.com/user-attachments/assets/be11a7d3-f0dc-4347-b9e7-004f4bd71e31" />

Setelah di isi:
<img width="693" height="362" alt="Screenshot 2026-11-21 112435" src="https://github.com/user-attachments/assets/641349a0-3e21-49ef-8c3f-0774829af45d" />

## Pembuat

*Nama : Wirabuana Ramadhana Jauhari*

*NIM : F1D02510030*
