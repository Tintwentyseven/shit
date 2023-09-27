package GraphPrim;

import java.util.Arrays;

public class Control {
	int[][] matrix;
	protected int numVers;
	protected String pathFile;
	protected boolean[] visited;
	int[][]matrixx;

	public Control(int[][] matrix) {
		super();
		this.matrix = matrix;
		visited = new boolean[matrix.length];
	}

	// Kiểm tra liên thoông cho đồ thị vô hướng

	public boolean isUnGraphConnected(int[][] graph) {
		visited = new boolean[graph.length];
		int startNode = 0;
		dfs(graph, startNode, visited);
		for (int i = 0; i < visited.length; i++) {
			if (!visited[i]) {
				return false;
			}
		}
		return true;
	}

	private void dfs(int[][] graph, int v, boolean[] visited) {
		visited[v] = true;
		for (int i = 0; i < graph.length; i++) {
			if (graph[v][i] != 0 && !visited[i]) {
				dfs(graph, i, visited);
			}
		}
	}

	// Kiểm tra liên thông và xét tính liên thông mạnh yếu cho đồ thị có hướng
	public boolean isGraphStronglyConnected(int[][] graph) {
		// Kiểm tra liên thông mạnh
		if (!isStronglyConnected(graph)) {
			return false;
		}

		// Kiểm tra liên thông yếu
		int[][] transpose = transposeGraph(graph);
		countConnectedComponents(graph);
		return isStronglyConnected(transpose);
	}

	public boolean isGraphConnected(int[][] graph) {
		visited = new boolean[graph.length];
		dfs(graph, 0, visited);

		for (boolean v : visited) {
			if (!v) {
				return false;
			}
		}

		return true;
	}

	public boolean isStronglyConnected(int[][] graph) {
		visited = new boolean[graph.length];
		dfs(graph, 0, visited);

		for (boolean v : visited) {
			if (!v) {
				return false;
			}
		}

		int[][] transpose = transposeGraph(graph);
		Arrays.fill(visited, false);
		dfs(transpose, 0, visited);

		for (boolean v : visited) {
			if (!v) {
				return false;
			}
		}

		return true;
	}

	// Chuyển đổi từ có hướng sang vô hướng
	public int[][] transposeGraph(int[][] graph) {
		int[][] transpose = new int[graph.length][graph.length];

		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph.length; j++) {
				transpose[j][i] = graph[i][j];
			}
		}

		return transpose;
	}

	public int countConnectedComponents(int[][] graph) {
		int count = 0;
		int n = graph.length;
		boolean[] visited = new boolean[n];

		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				dfs(graph, i, visited);

				count++;
			}
		}

		return count;
	}

	// Phương thức này tìm đỉnh có giá trị key nhỏ nhất từ tập đỉnh chưa được bao
	// gồm trong MST
	// Tham số:
	// - keys: một mảng chứa các giá trị key của tất cả các đỉnh
	// - inMST: một mảng boolean cho biết đỉnh nào nằm trong MST
	// Trả về: đỉnh có giá trị key nhỏ nhất chưa được bao gồm trong MST
	public int findMinKeyVertex(int minWeights[], boolean inMST[]) {
		int minIndex = -1,
				minValue = Integer.MAX_VALUE;

		for (int vertex = 0; vertex < matrix.length; vertex++) {
			if (!inMST[vertex] && minWeights[vertex] < minValue) {
				minValue = minWeights[vertex];
				minIndex = vertex;
			}
		}
		return minIndex;
	}

	// Phương thức này thiết kế MST cho đồ thị bằng thuật toán Prim
	// Parameter
	// - graph: một ma trận chứa đồ thị đầu vào
	// Returns: một chuỗi đại diện cho MST và tổng trọng số của nó
	public String designMSTForUnGraph(int[][] graph) {
		String result = "";
		int[] mst = new int[graph.length];
		int[] keys = new int[graph.length];
		boolean[] visited = new boolean[graph.length];
		Arrays.fill(keys, Integer.MAX_VALUE);
		keys[0] = 0;
		mst[0] = -1;

		for (int i = 0; i < graph.length - 1; i++) {
			int u = findMinKeyVertex(keys, visited);
			visited[u] = true;

			for (int v = 0; v < graph.length; v++) {
				if (graph[u][v] != 0 && !visited[v] && graph[u][v] < keys[v]) {
					mst[v] = u;
					keys[v] = graph[u][v];
				}
			}
		}

		result += "Cạnh \t\t Trọng số\n";
		int totalWeight = 0;
		for (int v = 1; v < graph.length; v++) {
			result += (mst[v] + 1) + " - " + (v + 1) + "\t\t" + graph[mst[v]][v] + "\n";
			matrixx = new int[graph.length][graph.length];
			matrixx[mst[v]][v]= graph[mst[v]][v];
			
			totalWeight += graph[mst[v]][v];
		}

		result += "Tổng trọng số: " + totalWeight;

		return result;
	}

	public String designMSTForDirGraph(int[][] graph) {
		String result = "";
		int[] mst = new int[graph.length];
		int[] keys = new int[graph.length];
		boolean[] visited = new boolean[graph.length];
		Arrays.fill(keys, Integer.MAX_VALUE);
		keys[0] = 0;
		mst[0] = -1;

		for (int i = 0; i < graph.length - 1; i++) {
			int u = findMinKeyVertex(keys, visited);
			visited[u] = true;

			for (int v = 0; v < graph.length; v++) {
				if (graph[u][v] != 0 && !visited[v] && graph[u][v] < keys[v]) {
					mst[v] = u;
					keys[v] = graph[u][v];
				}
			}
		}

		result += "Cạnh \t\t Trọng số\n";
		int totalWeight = 0;
		for (int v = 1; v < graph.length; v++) {
			result += (mst[v] + 1) + " -> " + (v + 1) + "\t\t" + graph[mst[v]][v] + "\n";
			totalWeight += graph[mst[v]][v];
		}

		result += "Tổng trọng số: " + totalWeight;

		return result;
	}

	public String showMST(int[][] matrixWeight, boolean isUnGraph) {
		if (isUnGraph) {
			return designMSTForUnGraph(matrixWeight);

		}
		return designMSTForDirGraph(matrixWeight);

	}

	// Tạo ma trận cây khung nhỏ nhất
	public int[][] getMSTMatrix(int[][] graph) {
		int[] mst = new int[graph.length];
		int[] keys = new int[graph.length];
		boolean[] visited = new boolean[graph.length];
		Arrays.fill(keys, Integer.MAX_VALUE);
		keys[0] = 0;
		mst[0] = -1;

		for (int i = 0; i < graph.length - 1; i++) {
			int u = findMinKeyVertex(keys, visited);
			visited[u] = true;

			for (int v = 0; v < graph.length; v++) {
				if (graph[u][v] != 0 && !visited[v] && graph[u][v] < keys[v]) {
					mst[v] = u;
					keys[v] = graph[u][v];
				}
			}
		}

		// Tạo ma trận cây khung nhỏ nhất
		int[][] mstMatrix = new int[graph.length][graph.length];
		for (int i = 1; i < graph.length; i++) {
			int parent = mst[i];
			mstMatrix[parent][i] = graph[parent][i];
			mstMatrix[i][parent] = graph[i][parent]; // Nếu đồ thị có hướng thì ta không cần gán ngược lại
		}

		return mstMatrix;
	}

	public String matrixToString(int[][] matrix) {
		String result = "";
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				result += matrix[i][j] + " ";
			}
			result += "\n";
		}
		return result;
	}

}
