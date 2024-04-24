package eviden;

public class DocumentoPresentacion implements InterfazDocumento {

	private String titulo;
	private String contenido;
	private int numPaginas;

	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return titulo;
	}

	@Override
	public void setTitulo(String titulo) {
		// TODO Auto-generated method stub
		this.titulo = titulo;

	}

	@Override
	public String getContenido() {
		// TODO Auto-generated method stub
		return contenido;
	}

	@Override
	public void setContenidos(String contenido) {
		// TODO Auto-generated method stub
		this.contenido = contenido;

	}

	@Override
	public int getNumPaginasImpresion() {
		// TODO Auto-generated method stub
		return numPaginas;
	}

	@Override
	public void setNumPaginasImpresion(int numPaginas) {
		// TODO Auto-generated method stub
		this.numPaginas = numPaginas;
	}

}
