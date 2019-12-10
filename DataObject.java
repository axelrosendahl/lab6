package lab6;

	public class DataObject extends Object{
		protected String name;
		protected int price;
		
		
		public DataObject() {
			
		}
		
		public DataObject(String name, int price) {
			this.setPrice(price);
			this.setName(name);
			
		}

		private void setName(String name) {
			// TODO Auto-generated method stub
			this.name=name;
		}

		private void setPrice(int price) {
			// TODO Auto-generated method stub
			this.price=price;
			
		}
		public String getName() {
			return name;
		}

		public int getPrice() {
			return price;
		}
	}}