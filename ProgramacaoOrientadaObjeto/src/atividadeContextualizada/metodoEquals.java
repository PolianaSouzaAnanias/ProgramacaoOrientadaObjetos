package atividadeContextualizada;

public class metodoEquals {

	public static void main(String[] args) {
		private long id;
		private String nomeAutor;
		private int anoLancamento;
		private String titulo;

		public String getNomeAutor() {
			return nomeAutor;
		}
		public void setNomeAutor(String nomeAutor) {
			this.nomeAutor = nomeAutor;
		}
		public int getAnoLancamento() {
			return anoLancamento;
		}
		public void setAnoLancamento(int anoLancamento) {
			this.anoLancamento = anoLancamento;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Livro other = (Livro) obj;
			if (anoLancamento != other.anoLancamento)
				return false;
			if (nomeAutor == null) {
				if (other.nomeAutor != null)
					return false;
			} else if (!nomeAutor.equals(other.nomeAutor))
				return false;
			if (titulo == null) {
				if (other.titulo != null)
					return false;
			} else if (!titulo.equals(other.titulo))
				return false;
			return true;
		}
}
