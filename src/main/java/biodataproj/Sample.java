package biodataproj;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Sample {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	private long collectionid;
    private String donorcount;
    private String materialtype;

    public Sample() {
		super();
    }

    public Sample(String donorcount, String materialtype) {
		super();
		this.donorcount = donorcount;
		this.materialtype = materialtype;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public long getcollectionId() {
		return collectionid;
	}

	public void setcollectionId(long collectionid) {
		this.collectionid = collectionid;
	}
	public String getdonorC() {
		return donorcount;
	}

	public void setdonorC(String donorcount) {
		this.donorcount = donorcount;
	}

	public String getDescription() {
		return materialtype;
	}

	public void setMaterial(String materialtype) {
		this.materialtype = materialtype;
	}
}
