public class PesananSudahAdaException extends Exception {
    private Pesanan pesanan_error;

    public PesananSudahAdaException(Pesanan pesanan_input)
    {
        super("Pesanan yang dipesan oleh :");
        this.pelanggan_error=pesanan_input;
    }
    public String getPesan()
    {
        return super.getMessage() + pesanan_error.getPelanggan().getNama()
                + "sudah melakukan pemesanan.";
    }

}
