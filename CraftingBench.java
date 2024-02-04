package inheritancezz;

public class  CraftingBench {
	
	public static void main(String[] args) {
		System.out.println("crafting bench has following : tools and weapons ");
		CraftingBench cb = new CraftingBench();
		cb.craftingtools();
		cb.craftingweapons();
		
	}
	
	void craftingtools() {
		System.out.println("crafting tools : ");
		Craftable pickaxe = new Pickaxe();
		Craftable axe = new Axe();
		
		pickaxe.craft();
		axe.craft();
		
	}
	void craftingweapons() {
		System.out.println("crafting tools : ");
		Craftable sword = new Sword();
		Craftable bow = new Bow();
		
		sword.craft();
		bow.craft();
	
	}
	
	interface Craftable {
		void craft();
	}
	class Pickaxe implements Craftable{
		
		@Override
		public void craft() {
			 System.out.println("Crafted a pickaxe");
		}
	}
		class Axe implements Craftable{
			@Override
			public void craft() {
				 System.out.println("Crafted a axe");
			}
		}
			class Sword implements Craftable{
				@Override
				public void craft() {
					 System.out.println("Crafted a sword");
				}
			}
				class Bow implements Craftable{
					@Override
					public void craft() {
						 System.out.println("Crafted a bow");
		}
				}
		
				
			
		/* current version is 0.0
	/* will update the crafting bench soon v 0.1 */
}
	


