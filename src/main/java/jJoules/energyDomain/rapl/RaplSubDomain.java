/**
 * 
 */
package jJoules.energyDomain.rapl;

/**
 * @author sanoussy
 *
 */
public abstract class RaplSubDomain extends RaplDomain {
	
	private int parentSocket;

	/**
	 * @param socket
	 */
	public RaplSubDomain(int subSocket,int parentSocket) {
		super(subSocket);
		this.parentSocket = parentSocket;
	}

	/**
	 * @return a sub socket (id of this domain)
	 */
	public int getParentSocket() {
		return this.parentSocket;
	}
	
	@Override
	public String domainPath() {
		return RaplPackageDomain.RAPL_PKG_PATH_NAME+this.getParentSocket()+"/intel-rapl:"+
				this.getParentSocket()+":"+this.getSocket();
	}
	
	/**
	 * @return a representation of each domain like `package-0`
	 */
	public String toString() {
		return this.getDomainName()+"_"+this.getSocket();
	}
	
}
