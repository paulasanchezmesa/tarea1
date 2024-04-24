package eviden;

public class DocumentoTexto implements InterfazDocumento {
	private String titulo, contenido;
	private int numPaginas;

	@Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo=titulo;
    }

    @Override
    public String getContenido() {
        return contenido;
    }

    @Override
    public void setContenidos(String contenido) {
        this.contenido=contenido;
    }

    @Override
    public int getNumPaginasImpresion() {
        return numPaginas;
    }

    @Override
    public void setNumPaginasImpresion(int numPaginas) {
        this.numPaginas=numPaginas;
    }


}
