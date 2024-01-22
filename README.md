#COMMONLY USE HIBERNATE ANNOTATIONS

#@Entity -> use to mark any class as Entity.
#@Table -> use to change the table details.
#@Id -> use to mark column as id (primary key).
#@GeneratedValue -> hibernate will automatically generate values for that using an internal sequence. Therefore we don't have to set it manually.
#@Column -> Can be used to specify column mappings. For example , to change the column name in the associated table in database.
#@Transient -> This tells hibernate not to save this field.
#@Temporal -> @Temporal over a date field tells hibernate the formate in which the date needs to be saved.
#@Lob -> @Lob tells hibernate that this is a large object, not a simple object.


