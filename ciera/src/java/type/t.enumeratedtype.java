T_b("package ");
T_b(self->package);
T_b(";");
T_b("\n");
T_b(imports);
T_b("\n");
T_b("public enum ");
T_b(self->name);
T_b(" implements IXtumlType<");
T_b(self->name);
T_b("> {");
T_b("\n");
T_b("    ");
T_b("UNINITIALIZED_ENUM( -1 )");
T_b(enumerators);
T_b("\n");
T_b("    ");
T_b("private final int value;");
T_b("\n");
T_b("    ");
T_b(self->name);
T_b("( int value ) {");
T_b("\n");
T_b("        ");
T_b("this.value = value;");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");
T_b("    ");
T_b("public int getValue() {");
T_b("\n");
T_b("        ");
T_b("return value;");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");
T_b("    ");
T_b("@Override");
T_b("\n");
T_b("    ");
T_b("public boolean equality( ");
T_b(self->name);
T_b(" value ) throws XtumlException {");
T_b("\n");
T_b("        ");
T_b("return null != value && this.value == value.getValue();");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");
T_b("    ");
T_b("@Override");
T_b("\n");
T_b("    ");
T_b("public ");
T_b(self->name);
T_b(" defaultValue() {");
T_b("\n");
T_b("        ");
T_b("return UNINITIALIZED_ENUM;");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");
T_b("}");
T_b("\n");
