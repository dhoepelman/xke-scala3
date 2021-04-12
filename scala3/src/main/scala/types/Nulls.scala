package types

// Explicit nulls

// Compile error if -Yexplicit-nulls is added
// val notnull: String = null

// union types to the rescue
val nullable: String | Null = null