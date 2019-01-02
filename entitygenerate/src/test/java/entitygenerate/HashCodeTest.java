package entitygenerate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

public class HashCodeTest implements Serializable{
	private static final long serialVersionUID = 1L;
	private int int0;
	private double double0;
	private float float0;
	private byte byte0;
	private short short0;
	private char char0;
	private long long0;
	private boolean boolean0;

	private Integer Integer0;
	private Double Double00;
	private Float Float00;
	private Byte Byte00;
	private Short Short00;
	private Character Character0;
	private Long Long00;
	private Boolean Boolean00;
	
	private String String0;
	private BigDecimal BigDecimal0;
	private Date date;
	
	public HashCodeTest() {
		
	}

	public HashCodeTest(int int0, double double0, float float0, byte byte0, short short0, char char0, long long0,
			boolean boolean0, Integer integer0, Double double00, Float float00, Byte byte00, Short short00,
			Character character0, Long long00, Boolean boolean00, String string0, BigDecimal bigDecimal0, Date date) {
		super();
		this.int0 = int0;
		this.double0 = double0;
		this.float0 = float0;
		this.byte0 = byte0;
		this.short0 = short0;
		this.char0 = char0;
		this.long0 = long0;
		this.boolean0 = boolean0;
		Integer0 = integer0;
		Double00 = double00;
		Float00 = float00;
		Byte00 = byte00;
		Short00 = short00;
		Character0 = character0;
		Long00 = long00;
		Boolean00 = boolean00;
		String0 = string0;
		BigDecimal0 = bigDecimal0;
		this.date = date;
	}

	public int getInt0() {
		return int0;
	}

	public void setInt0(int int0) {
		this.int0 = int0;
	}

	public double getDouble0() {
		return double0;
	}

	public void setDouble0(double double0) {
		this.double0 = double0;
	}

	public float getFloat0() {
		return float0;
	}

	public void setFloat0(float float0) {
		this.float0 = float0;
	}

	public byte getByte0() {
		return byte0;
	}

	public void setByte0(byte byte0) {
		this.byte0 = byte0;
	}

	public short getShort0() {
		return short0;
	}

	public void setShort0(short short0) {
		this.short0 = short0;
	}

	public char getChar0() {
		return char0;
	}

	public void setChar0(char char0) {
		this.char0 = char0;
	}

	public long getLong0() {
		return long0;
	}

	public void setLong0(long long0) {
		this.long0 = long0;
	}

	public boolean isBoolean0() {
		return boolean0;
	}

	public void setBoolean0(boolean boolean0) {
		this.boolean0 = boolean0;
	}

	public Integer getInteger0() {
		return Integer0;
	}

	public void setInteger0(Integer integer0) {
		Integer0 = integer0;
	}

	public Double getDouble00() {
		return Double00;
	}

	public void setDouble00(Double double00) {
		Double00 = double00;
	}

	public Float getFloat00() {
		return Float00;
	}

	public void setFloat00(Float float00) {
		Float00 = float00;
	}

	public Byte getByte00() {
		return Byte00;
	}

	public void setByte00(Byte byte00) {
		Byte00 = byte00;
	}

	public Short getShort00() {
		return Short00;
	}

	public void setShort00(Short short00) {
		Short00 = short00;
	}

	public Character getCharacter0() {
		return Character0;
	}

	public void setCharacter0(Character character0) {
		Character0 = character0;
	}

	public Long getLong00() {
		return Long00;
	}

	public void setLong00(Long long00) {
		Long00 = long00;
	}

	public Boolean getBoolean00() {
		return Boolean00;
	}

	public void setBoolean00(Boolean boolean00) {
		Boolean00 = boolean00;
	}

	public String getString0() {
		return String0;
	}

	public void setString0(String string0) {
		String0 = string0;
	}

	public BigDecimal getBigDecimal0() {
		return BigDecimal0;
	}

	public void setBigDecimal0(BigDecimal bigDecimal0) {
		BigDecimal0 = bigDecimal0;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((BigDecimal0 == null) ? 0 : BigDecimal0.hashCode());
		result = prime * result + ((Boolean00 == null) ? 0 : Boolean00.hashCode());
		result = prime * result + ((Byte00 == null) ? 0 : Byte00.hashCode());
		result = prime * result + ((Character0 == null) ? 0 : Character0.hashCode());
		result = prime * result + ((Double00 == null) ? 0 : Double00.hashCode());
		result = prime * result + ((Float00 == null) ? 0 : Float00.hashCode());
		result = prime * result + ((Integer0 == null) ? 0 : Integer0.hashCode());
		result = prime * result + ((Long00 == null) ? 0 : Long00.hashCode());
		result = prime * result + ((Short00 == null) ? 0 : Short00.hashCode());
		result = prime * result + ((String0 == null) ? 0 : String0.hashCode());
		result = prime * result + (boolean0 ? 1231 : 1237);
		result = prime * result + byte0;
		result = prime * result + char0;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		long temp;
		temp = Double.doubleToLongBits(double0);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + Float.floatToIntBits(float0);
		result = prime * result + int0;
		result = prime * result + (int) (long0 ^ (long0 >>> 32));
		result = prime * result + short0;
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
		HashCodeTest other = (HashCodeTest) obj;
		if (BigDecimal0 == null) {
			if (other.BigDecimal0 != null)
				return false;
		} else if (!BigDecimal0.equals(other.BigDecimal0))
			return false;
		if (Boolean00 == null) {
			if (other.Boolean00 != null)
				return false;
		} else if (!Boolean00.equals(other.Boolean00))
			return false;
		if (Byte00 == null) {
			if (other.Byte00 != null)
				return false;
		} else if (!Byte00.equals(other.Byte00))
			return false;
		if (Character0 == null) {
			if (other.Character0 != null)
				return false;
		} else if (!Character0.equals(other.Character0))
			return false;
		if (Double00 == null) {
			if (other.Double00 != null)
				return false;
		} else if (!Double00.equals(other.Double00))
			return false;
		if (Float00 == null) {
			if (other.Float00 != null)
				return false;
		} else if (!Float00.equals(other.Float00))
			return false;
		if (Integer0 == null) {
			if (other.Integer0 != null)
				return false;
		} else if (!Integer0.equals(other.Integer0))
			return false;
		if (Long00 == null) {
			if (other.Long00 != null)
				return false;
		} else if (!Long00.equals(other.Long00))
			return false;
		if (Short00 == null) {
			if (other.Short00 != null)
				return false;
		} else if (!Short00.equals(other.Short00))
			return false;
		if (String0 == null) {
			if (other.String0 != null)
				return false;
		} else if (!String0.equals(other.String0))
			return false;
		if (boolean0 != other.boolean0)
			return false;
		if (byte0 != other.byte0)
			return false;
		if (char0 != other.char0)
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (Double.doubleToLongBits(double0) != Double.doubleToLongBits(other.double0))
			return false;
		if (Float.floatToIntBits(float0) != Float.floatToIntBits(other.float0))
			return false;
		if (int0 != other.int0)
			return false;
		if (long0 != other.long0)
			return false;
		if (short0 != other.short0)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HashCodeTest ["
				+ "int0=" + int0 + ", double0=" + double0 + ", float0=" + float0 + ", byte0=" + byte0
				+ ", short0=" + short0 + ", char0=" + char0 + ", long0=" + long0 + ", boolean0=" + boolean0
				+ ", Integer0=" + Integer0 + ", Double00=" + Double00 + ", Float00=" + Float00 + ", Byte00=" + Byte00
				+ ", Short00=" + Short00 + ", Character0=" + Character0 + ", Long00=" + Long00 + ", Boolean00="
				+ Boolean00 + ", String0=" + String0 + ", BigDecimal0=" + BigDecimal0 + ", date=" + date 
				+ "]";
	}
	
}
