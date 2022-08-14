package ss.technology.hindi_dictionary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AlertDialog;

public class Show_change_Language_Dialoge {


    public static void change(final Context context)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setIcon(R.drawable.change_language_icon);
        builder.setTitle("Select Your Language");
        LayoutInflater inflater =LayoutInflater.from(context);
        View viewss=inflater.inflate(R.layout.changelanguage, null);
       /* builder.setTitle("Selct Your Language...");
        builder.setMessage("By default all languages will be selcted.");*/
        builder.setCancelable(false);
        // builder.setIcon(R.drawable.translate);
        builder.setView(viewss);
        final AlertDialog alertDialog = builder.create();
        Button save=(Button) viewss.findViewById(R.id.save);
        Button close=(Button ) viewss.findViewById(R.id.close);
        final Spinner spinner=(Spinner) viewss.findViewById(R.id.spinner);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = spinner.getSelectedItem().toString().toLowerCase();
                SharePreference_Store.setValue(text,context);
                alertDialog.dismiss();
            }
        });
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });
        alertDialog.show();
    }

}
