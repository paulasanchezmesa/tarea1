package eviden;

public class UsoDocumento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creación de documentos
        InterfazDocumento documentoTexto = new DocumentoTexto();
        InterfazDocumento documentoPresentacion = new DocumentoPresentacion();
        InterfazDocumento documentoPDF = new DocumentoPDF();

        // Setters
        documentoTexto.setTitulo("Documento de texto");
        documentoTexto.setContenidos("Contenido del documento de texto.");
        documentoTexto.setNumPaginasImpresion(5);

        documentoPresentacion.setTitulo("Presentación");
        documentoPresentacion.setContenidos("Contenido de la presentación.");
        documentoPresentacion.setNumPaginasImpresion(10);

        documentoPDF.setTitulo("Documento PDF");
        documentoPDF.setContenidos("Contenido del documento PDF.");
        documentoPDF.setNumPaginasImpresion(15);

        // Getters
        System.out.println("Documento de texto:");
        System.out.println("Título: " + documentoTexto.getTitulo());
        System.out.println("Contenido: " + documentoTexto.getContenido());
        System.out.println("Número de páginas: " + documentoTexto.getNumPaginasImpresion());
        
        System.out.println(" ");

        System.out.println("Documento de presentación:");
        System.out.println("Título: " + documentoPresentacion.getTitulo());
        System.out.println("Contenido: " + documentoPresentacion.getContenido());
        System.out.println("Número de páginas: " + documentoPresentacion.getNumPaginasImpresion());
        
        System.out.println(" ");

        System.out.println("Documento PDF:");
        System.out.println("Título: " + documentoPDF.getTitulo());
        System.out.println("Contenido: " + documentoPDF.getContenido());
        System.out.println("Número de páginas: " + documentoPDF.getNumPaginasImpresion());

	}

}
