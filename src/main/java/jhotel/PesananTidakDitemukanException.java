public class PesananTidakDitemukanException extends Exception
{
    Customer pelanggan_error;

    public PesananTidakDitemukanException(Customer pelanggan_input)
    {
        super("Pesanan yang dipesan oleh :");
        this.pelanggan_error=pelanggan_input;
    }

    public String getPesan()
    {
        return super.getMessage() + pelanggan_error.getNama() + " tidak ditemukan";
    }
}
