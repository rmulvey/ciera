if ( isgeneric ) {
T_b("    ");
T_b("public synchronized ");
T_b(class_name);
T_b(" selectAny");
T_b(class_key_letters);
T_b("FromInstances() {");
T_b("\n");
T_b("        ");
T_b("return ((");
T_b(class_set_name);
T_b(")getInstanceSet(");
T_b(class_name);
T_b(".class)).selectAny");
T_b(class_key_letters);
T_b("FromInstances( null );");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");
T_b("    ");
T_b("public synchronized ");
T_b(class_name);
T_b(" selectAny");
T_b(class_key_letters);
T_b("FromInstances( Where condition ) {");
T_b("\n");
T_b("        ");
T_b("return ((");
T_b(class_set_name);
T_b(")getInstanceSet(");
T_b(class_name);
T_b(".class)).selectAny");
T_b(class_key_letters);
T_b("FromInstances( condition );");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");
T_b("    ");
T_b("public synchronized ");
T_b(class_set_name);
T_b(" selectMany");
T_b(class_key_letters);
T_b("sFromInstances() {");
T_b("\n");
T_b("        ");
T_b("return (");
T_b(class_set_name);
T_b(")getInstanceSet(");
T_b(class_name);
T_b(".class);");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");
T_b("    ");
T_b("public synchronized ");
T_b(class_set_name);
T_b(" selectMany");
T_b(class_key_letters);
T_b("sFromInstances( Where condition ) {");
T_b("\n");
T_b("        ");
T_b("return ((");
T_b(class_set_name);
T_b(")getInstanceSet(");
T_b(class_name);
T_b(".class)).selectMany");
T_b(class_key_letters);
T_b("sFromInstances( condition );");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");
} else {
if ( isempty ) {
T_b("    ");
T_b("@Override");
T_b("\n");
T_b("    ");
T_b("public synchronized ");
T_b(class_name);
T_b(" selectAny");
T_b(class_key_letters);
T_b("FromInstances( Where condition ) {");
T_b("\n");
T_b("        ");
T_b("return ");
T_b(class_name);
T_b(".empty");
T_b(class_name);
T_b(";");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");
T_b("   ");
T_b(" ");
T_b("\n");
T_b("    ");
T_b("@Override");
T_b("\n");
T_b("    ");
T_b("public synchronized ");
T_b(class_set_name);
T_b(" selectMany");
T_b(class_key_letters);
T_b("sFromInstances( Where condition ) {");
T_b("\n");
T_b("        ");
T_b("return ");
T_b(class_set_name);
T_b(".empty");
T_b(class_set_name);
T_b(";");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");
} else {
T_b("    ");
T_b("public synchronized ");
T_b(class_name);
T_b(" selectAny");
T_b(class_key_letters);
T_b("FromInstances( Where condition ) {");
T_b("\n");
T_b("        ");
T_b("return (");
T_b(class_name);
T_b(")selectAny( condition );");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");
T_b("   ");
T_b(" ");
T_b("\n");
T_b("    ");
T_b("public synchronized ");
T_b(class_set_name);
T_b(" selectMany");
T_b(class_key_letters);
T_b("sFromInstances( Where condition ) {");
T_b("\n");
T_b("        ");
T_b("return (");
T_b(class_set_name);
T_b(")selectMany( condition );");
T_b("\n");
T_b("    ");
T_b("}");
T_b("\n");
}
}
