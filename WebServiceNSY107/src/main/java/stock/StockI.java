package stock;

public interface StockI {

	/**
	 * Affiche le nombre d'exemplaire d'un produit
	 * 
	 * @param Id est le l'id du produit
	 * @return le nombre d'exemplaire d'un produit
	 */
	public long nbrExemplaire(long Id);

	/**
	 * Lance une procédure d'achat
	 * 
	 * @param Id      du produit à acheter
	 * @param nbr     est les nbr de produit à acheter
	 * @param address est l'adresse de destination du produit
	 * @return
	 * @throws Exception si il n'y a plus de produit.
	 */
	public boolean achatExemplaire(long Id, long nbr, Address address) throws Exception;

}
