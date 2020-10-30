package biodataproj;

import java.util.List;

import javax.persistence.*;


@Entity
public class Collection {
	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private long id;
		private String disease;
		private String title;
		@ManyToMany
		private List<Sample> samples;

		public Collection() {
			super();
		}

		public Collection(String firstName, String lastName, String email,
				List<Sample> samples) {
			super();
			this.disease = firstName;
			this.title = lastName;
		
			this.samples = samples;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getDisease() {
			return disease;
		}

		public void setDisease(String disease) {
			this.disease = disease;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}


		public List<Sample> getSamples() {
			return samples;
		}

		public void setSamples(List<Sample> samples) {
			this.samples = samples;
		}

		public boolean hasSamples(Sample sample) {
			for (Sample containedSample: getSamples()) {
				if (containedSample.getId() == sample.getId()) {
					return true;
				}
			}
			return false;
		}

}

