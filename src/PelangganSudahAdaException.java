public class PelangganSudahAdaException extends Exception{
    Customer pelanggan_error;

    public PelangganSudahAdaException(Customer pelanggan_input) {
        super("Pelanggan dengan Data: ");
        this.pelanggan_error=pelanggan_input;


    }

    public String getPesan () {
        return super.getMessage() + pelanggan_error + " sudah terdaftar.";
    }
}
