import javax.swing.*;
import java.awt.*;

public class AplikasiGUI {

    public static void main(String[] args) {

        // 1. TOP LEVEL CONTAINER
        //    Wadah paling atas, tempat semua komponen diletakkan.
        //    Contoh: JFrame, JDialog, JApplet
        JFrame frame = new JFrame("Format Data Mahasiswa");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // tampil di tengah layar

        // 4. LAYOUT (pengatur posisi komponen)
        //    Frame memakai BorderLayout: NORTH, CENTER, SOUTH, EAST, WEST
        frame.setLayout(new BorderLayout());

        // 2. INTERMEDIATE CONTAINER
        //    Wadah perantara yang diletakkan di dalam top level container.
        //    Contoh: JPanel, JScrollPane, JTabbedPane

        // --- Panel judul (layout: FlowLayout) ---
        JPanel panelJudul = new JPanel(new FlowLayout());

        // --- Panel form (layout: GridLayout 4 baris x 2 kolom) ---
        JPanel panelForm = new JPanel(new GridLayout(4, 2, 10, 10));
        panelForm.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        // --- Panel tombol (layout: FlowLayout) ---
        JPanel panelTombol = new JPanel(new FlowLayout());

        // 3. ATOMIC COMPONENTS
        //    Komponen paling dasar yang berinteraksi dengan pengguna.
        //    Contoh: JLabel, JTextField, JButton, JComboBox, JCheckBox
        JLabel lblJudul = new JLabel("FORMAT DATA MAHASISWA");
        lblJudul.setFont(new Font("Arial", Font.BOLD, 16));

        JLabel lblNama = new JLabel("Nama");
        JTextField txtNama = new JTextField();

        JLabel lblNim = new JLabel("NIM");
        JTextField txtNim = new JTextField();

        JLabel lblJurusan = new JLabel("Jurusan");
        String[] daftarJurusan = {"Teknik Informatika", "Teknik Mesin","Teknik Sipil","Teknik Industri","Teknik Elektro"};
        JComboBox<String> cmbJurusan = new JComboBox<>(daftarJurusan);

        JLabel lblHasilJudul = new JLabel("Hasil");
        JLabel lblHasil = new JLabel("-");

        JButton btnSimpan = new JButton("Simpan");
        JButton btnReset = new JButton("Reset");

        // Menyusun komponen: Atomic -> Intermediate -> Top Level

        // Atomic masuk ke Intermediate (JPanel)
        panelJudul.add(lblJudul);

        panelForm.add(lblNama);
        panelForm.add(txtNama);
        panelForm.add(lblNim);
        panelForm.add(txtNim);
        panelForm.add(lblJurusan);
        panelForm.add(cmbJurusan);
        panelForm.add(lblHasilJudul);
        panelForm.add(lblHasil);

        panelTombol.add(btnSimpan);
        panelTombol.add(btnReset);

        // Intermediate masuk ke Top Level (JFrame) sesuai posisi BorderLayout
        frame.add(panelJudul, BorderLayout.NORTH);
        frame.add(panelForm, BorderLayout.CENTER);
        frame.add(panelTombol, BorderLayout.SOUTH);

        // Aksi tombol (event handling sederhana)
        btnSimpan.addActionListener(e -> {
            String nama = txtNama.getText();
            String nim = txtNim.getText();
            String jurusan = (String) cmbJurusan.getSelectedItem();
            lblHasil.setText(nama + " (" + nim + ") - " + jurusan);
        });

        btnReset.addActionListener(e -> {
            txtNama.setText("");
            txtNim.setText("");
            cmbJurusan.setSelectedIndex(0);
            lblHasil.setText("-");
        });

        // Tampilkan frame
        frame.setVisible(true);
    }
}