package com.funtower.entitygenerate.entity;

public class ColumnInfoFromDB {
	private String columnName;
	private String comments;
	private String tableName;
	private String dataType;
	private Integer dataLength;
	
	public ColumnInfoFromDB() {
		
	}

	public ColumnInfoFromDB(String columnName, String comments, String tableName, String dataType, Integer dataLength) {
		super();
		this.columnName = columnName;
		this.comments = comments;
		this.tableName = tableName;
		this.dataType = dataType;
		this.dataLength = dataLength;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public Integer getDatalength() {
		return dataLength;
	}

	public void setDatalength(Integer dataLength) {
		this.dataLength = dataLength;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((columnName == null) ? 0 : columnName.hashCode());
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((dataType == null) ? 0 : dataType.hashCode());
		result = prime * result + ((dataLength == null) ? 0 : dataLength.hashCode());
		result = prime * result + ((tableName == null) ? 0 : tableName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ColumnInfoFromDB other = (ColumnInfoFromDB) obj;
		if (columnName == null) {
			if (other.columnName != null)
				return false;
		} else if (!columnName.equals(other.columnName))
			return false;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (dataType == null) {
			if (other.dataType != null)
				return false;
		} else if (!dataType.equals(other.dataType))
			return false;
		if (dataLength == null) {
			if (other.dataLength != null)
				return false;
		} else if (!dataLength.equals(other.dataLength))
			return false;
		if (tableName == null) {
			if (other.tableName != null)
				return false;
		} else if (!tableName.equals(other.tableName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ColumnInfoFromDB [columnName=" + columnName + ", comments=" + comments + ", tableName=" + tableName
				+ ", dataType=" + dataType + ", dataLength=" + dataLength + "]";
	}
	
	
	
}
