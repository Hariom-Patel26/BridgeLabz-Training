package com.medwarehouse;

public class MedWarehouseApp {
	public static void main(String[] args) {
		MedWarehouseManager warehouse = new MedWarehouseManager();

		Medicine[] branchA = { new Medicine("Paracetamol 500mg", "P2025A01", "2026-02-15", "North"),
				new Medicine("Amoxicillin 250mg", "AMX-456", "2026-03-10", "North"),
				new Medicine("Ibuprofen 400mg", "IBU-321", "2026-07-05", "North") };


		Medicine[] branchB = { new Medicine("Omeprazole 20mg", "OMP654", "2026-01-30", "South"),
				new Medicine("Metformin 500mg", "MET112", "2026-04-12", "South"),
				new Medicine("Amlodipine 5mg", "AML987", "2026-06-18", "South") };


		Medicine[] branchC = { new Medicine("Azithromycin 500mg", "AZI-234", "2026-02-28", "East"),
				new Medicine("Vitamin D3", "VD3-567", "2026-03-25", "East"),
				new Medicine("Ciprofloxacin 500mg", "CIP890", "2026-08-10", "East") };

		System.out.println("Merging expiry-sorted lists from all branches...\n");

		Medicine[] mergedAB = warehouse.merge(branchA, branchB);
		Medicine[] allMedicines = warehouse.merge(mergedAB, branchC);

		System.out.println("Complete Warehouse Inventory (sorted by expiry):");
		warehouse.showInventory(allMedicines);

		warehouse.showExpiringSoon(allMedicines);

		System.out.println("\nAction required: Prioritize dispatch/return of items shown in alert.");
	}
}