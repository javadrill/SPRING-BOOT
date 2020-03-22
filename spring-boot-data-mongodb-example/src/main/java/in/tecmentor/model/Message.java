package in.tecmentor.model;

/**
 * The Class Message.
 */
public class Message {

	/** The key. */
	private String key;

	/** The value. */
	private String value;

	/**
	 * Instantiates a new message.
	 */
	public Message() {
		super();
	}

	/**
	 * Instantiates a new message.
	 *
	 * @param key
	 *            the key
	 * @param value
	 *            the value
	 */
	public Message(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}

	/**
	 * Instantiates a new message.
	 *
	 * @param key
	 *            the key
	 */
	public Message(String key) {
		super();
		this.key = key;
	}

	/**
	 * Gets the key.
	 *
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * Sets the key.
	 *
	 * @param key
	 *            the new key
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value.
	 *
	 * @param value
	 *            the new value
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
